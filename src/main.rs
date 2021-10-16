// this rewrite in rust used discord as both the IDE and version control
// dont expect much

use std::io;

fn input(prompt: String) -> String {
    println!("{}", prompt);
    let mut res = String::new();
    io::stdin()
        .read_line(&mut res)
        .expect("failed to gerb input");

    res
}

fn main() {
    let first_num = input("give first number mate:".into());
    let first_num = first_num.trim().parse::<i32>().unwrap();

    let second_num = input("give second number mate:".into());
    let second_num = second_num.trim().parse::<i32>().unwrap();

    let op = input("what do you want? (+ or - or / or *):".into());

    let res: i32;
    match op.trim() {
        "+" => {
            res = first_num + second_num;
        }
        "-" => {
            res = first_num - second_num;
        }
        "/" => {
            res = first_num / second_num;
        }
        "*" => {
            res = first_num * second_num;
        }
        _else => {
            println!("you stupid cunt mate what the hell is {}??????", _else);
            panic!("unsupported op");
        }
    }

    println!("yor operation was {} and the result is {}", op, res);
}
